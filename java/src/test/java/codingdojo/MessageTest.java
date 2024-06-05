package codingdojo;

import org.approvaltests.Approvals;
import org.approvaltests.StoryBoard;
import org.approvaltests.core.Options;
import org.approvaltests.reporters.AutoApproveReporter;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.utils.parseinput.ParseInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageTest {

    @Test
    @UseReporter(AutoApproveReporter.class)
    public void testHowAlive() {
        var expected = """
            Initial:
            Message: HOW
            
            Frame #1:
            HEX: [48, 4F, 57]
            
            Frame #2:
            [[5,4], [-4,11], [-10,2]]
            """;
        var storyboard = new StoryBoard();
        var message = "HOW";
        storyboard.add("Message: " + message);
        var hex = HexTranslator.toHex(message);
        storyboard.add("HEX: " + hex);
        storyboard.add(Stepper.getMovesFor(hex, 0));
        Approvals.verify(storyboard, new Options().inline(expected));
    }

}