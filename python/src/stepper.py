class Stepper:
    """
    This class is a placeholder for a real object that would be able to
    control an electric stepper motor.
    """

    # The number of steps to rotate a complete circle of 360 degrees
    STEPS = 2048

    # Speed of the motor in RPM
    MAX_SPEED = 15

    def __init__(self, pin1, pin2, pin3, pin4):
        self.speed = 10
        # Logic related to the pins is omitted in this exercise

    def set_speed(self, speed):
        """
        Set the speed of the motor in RPM. Maximum is defined above.
        """
        self.speed = speed

    def move_clockwise(self, steps):
        """
        Move the indicated number of steps clockwise.
        The size of a step is defined above.
        """
        # Logic to activate the relevant pins is omitted in this exercise
        pass

    def move_anticlockwise(self, steps):
        """
        Move the indicated number of steps anticlockwise.
        The size of a step is defined above.
        """
        # Logic to activate the relevant pins is omitted in this exercise
        pass

    def is_running(self):
        """
        Whether the motor is currently running.
        Motors that are moving should not be given new instructions.
        """
        # Logic to read the pins and determine this is omitted in this exercise
        return False
