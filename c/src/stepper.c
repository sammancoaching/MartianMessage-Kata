#include "stepper.h"

#include <stdlib.h>

struct Stepper_t *stepper_create() {
    int8_t pin1 = 8;
    int8_t pin2 = 9;
    int8_t pin3 = 10;
    int8_t pin4 = 1;
    return stepper_create_with_pins(pin1, pin2, pin3, pin4);
}

struct Stepper_t * stepper_create_with_pins(const int8_t pin1, const int8_t pin2, const int8_t pin3, const int8_t pin4) {
    struct Stepper_t* stepper = malloc(sizeof(*stepper));
    // logic related to the pins is omitted in this exercise
    stepper->speed = 10;
    return stepper;
}

void setSpeed(struct Stepper_t *stepper, int8_t speed) {
    stepper->speed = speed;
}

void move_clockwise(struct Stepper_t *stepper, int16_t steps) {
    // logic to activate the relevant pins is omitted in this exercise
}

void move_anticlockwise(struct Stepper_t *stepper, int16_t steps) {
    // logic to activate the relevant pins is omitted in this exercise
}

bool isRunning(struct Stepper_t *stepper) {
    // logic to read the pins and determine this omitted in this exercise
    return false;
}
