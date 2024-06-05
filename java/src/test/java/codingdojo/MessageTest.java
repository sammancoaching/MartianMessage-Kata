package codingdojo;

import com.spun.util.logger.SimpleLogger;
import org.approvaltests.Approvals;
import org.approvaltests.StoryBoard;
import org.approvaltests.core.Options;
import org.approvaltests.reporters.AutoApproveReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;
import org.lambda.actions.Action1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageTest {

    @Test
    @UseReporter(AutoApproveReporter.class)
    public void testHowAlive() {
        var expected = """
            Initial:
            Message: HOW ALIVE?
            
            Frame #1:
            HEX: [48, 4F, 57, 20, 41, 4C, 49, 56, 45, 3F]
            
            Frame #2:
            [[5,4], [-4,11], [-10,2], [-5,-2], [4,-3], [3,8], [-8,5], [-4,1], [-2,1], [-2,12], [EOM]]
            """;
        var storyboard = new StoryBoard();
        var message = "HOW ALIVE?";
        storyboard.add("Message: " + message);
        var hex = HexTranslator.toHex(message);
        storyboard.add("HEX: " + hex);
        storyboard.add(MessageMover.getMovesFor(hex, 0));
        Approvals.verify(storyboard, new Options().inline(expected));
    }

    @Test
    @UseReporter(AutoApproveReporter.class)
    public void testMoves() {
        var expected = """
            Event: Moving 600 clockwise
            Event: Sleeping 5 seconds
            Event: Moving 480 clockwise
            Event: Sleeping 10 seconds
            Event: Moving 480 counterclockwise
            Event: Sleeping 5 seconds
            Event: Moving 1320 clockwise
            Event: Sleeping 10 seconds
            Event: Moving 1920 counterclockwise
            """;
        var output = SimpleLogger.logToString();
        Stepper stepper = new Stepper(Action1.doNothing());
        stepper.move(new Move(5, 4, 0));
        stepper.move(new Move(-4, 11, 0));
        stepper.move(new EndOfMessage());
        Approvals.verify(output, new Options().inline(expected));
    }

}