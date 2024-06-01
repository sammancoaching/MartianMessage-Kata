#ifndef STEPPER_H
#define STEPPER_H

#include <stdbool.h>
#include <unistd.h>

// the number of steps to rotate a complete circle of 360 degrees
#define STEPS 2048

// the maximum speed of the motor in RPM
#define MAX_SPEED 15

/*
 * This struct is a placeholder for a real object that would be able to
 * control an electric stepper motor.
 */
struct Stepper_t {
    int8_t speed;
};

struct Stepper_t *stepper_create_with_pins(
    int8_t pin1,
    int8_t pin2,
    int8_t pin3,
    int8_t pin4);

struct Stepper_t *stepper_create();

// Set the speed of the motor in RPM. Maximum is defined above.
void setSpeed(struct Stepper_t* stepper, int8_t speed);

// Move the indicated number of steps. The size of a step is defined above.
void move_clockwise(struct Stepper_t* stepper, int16_t steps);
void move_anticlockwise(struct Stepper_t* stepper, int16_t steps);

// Whether the motor is currently moving.
// Motors that are moving should not be given new instructions.
bool isRunning(struct Stepper_t* stepper);

#endif //STEPPER_H
