#include "Stepper.h"
#include <unistd.h>

int main(int argc, char *argv[]) {

    // create an instance of the stepper class with suitable pins set up
    Stepper stepper(8, 10, 9, 11);

    // configure the stepper motor speed in RPM
    stepper.setSpeed(10);

    // move the motor the number of steps indicated by val
    uint8_t val = 42;
    stepper.move_clockwise(val);

    // wait for the stepper motor to finish moving
    while(stepper.isRunning()) {
        sleep(1);
    }
    
}

