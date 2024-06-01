from time import sleep

from stepper import *


def main():
    # Create an instance of the Stepper class with suitable pins set up
    stepper = Stepper(8, 10, 9, 11)

    # Configure the stepper motor speed in RPM
    stepper.set_speed(10)

    # Move the motor the number of steps indicated by val
    val = 42
    stepper.move_clockwise(val)

    # Wait for the stepper to finish moving
    while stepper.is_running():
        sleep(0.1)  # Sleep for 100 milliseconds


if __name__ == "__main__":
    main()
