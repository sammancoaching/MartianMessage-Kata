#ifndef STEPPER_H
#define STEPPER_H

#include <cstdint>

// the number of steps to rotate a complete circle of 360 degrees
#define STEPS 2048

// the maximum speed of the motor in RPM
#define MAX_SPEED = 15

/*
 * This class is a placeholder for a real object that would be able to
 * control an electric stepper motor.
 */
class Stepper {
public:
    explicit Stepper(
        const uint8_t pin1 = 8,
        const uint8_t pin2 = 9,
        const uint8_t pin3 = 10,
        const uint8_t pin4 = 11): _speed(10) {
    };

    // Set the speed of the motor in RPM. Maximum is defined above.
    void setSpeed(uint8_t);

    // Move the indicated number of steps. The size of a step is defined above.
    void move_clockwise(uint8_t steps);

    void move_anticlockwise(uint8_t steps);

    // Whether the motor is currently moving.
    // Motors that are moving should not be given new instructions.
    bool isRunning();

private:
    int _speed;
};


#endif //STEPPER_H
