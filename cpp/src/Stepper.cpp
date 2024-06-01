

#include "Stepper.h"

void Stepper::setSpeed(uint8_t speed) {
    _speed = speed;
}

void Stepper::move_clockwise(uint8_t steps) {
    // logic to activate the relevant pins is omitted in this exercise
}

void Stepper::move_anticlockwise(uint8_t steps) {
    // logic to activate the relevant pins is omitted in this exercise
}

bool Stepper::isRunning() {
    // logic to read the pins and determine this omitted in this exercise
    return false;
}


