#include "stepper.h"
#include <unistd.h>

int main(int argc, char *argv[]) {

    // create an instance of the stepper class with suitable pins set up
    struct Stepper_t* stepper = stepper_create();

    // configure the stepper motor speed in RPM
    setSpeed(stepper, 10);

    // move the motor the number of steps indicated by val
    int16_t val = 42;
    move_clockwise(stepper, val);

    // wait for the stepper motor to finish moving
    while(isRunning(stepper)) {
        sleep(1);
    }
    
}

