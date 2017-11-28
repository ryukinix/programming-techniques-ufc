#!/usr/bin/python


class Person(object):
    FEMALE = 0
    MALE = 1

    def __init__(self, name, sex):
        self.name = name
        self._sex = sex

    @property
    def sex(self):
        return 'male' if self._sex is self.MALE else 'female'

    def __str__(self):
        return self.name


class Parents(Person):

    def __init__(self, name, sex, child):
        super().__init__(name, sex)
        self.child = child

    def get_child(self):
        return self.child

    def __str__(self):
        pass
