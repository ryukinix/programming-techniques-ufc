#!/usr/bin/python3


class Calc(object):

    def __init__(self, a, b):
        self.a = a
        self.b = b

    def add(self):
        return self.a + self.b

    def sub(self):
        return self.a - self.b

    def mul(self):
        return self.a * self.b

    def div(self):
        return self.a / self.b


def test():
    c = Calc(10, 10)
    print(f"{c.a} + {c.b} = {c.add()}")
    print(f"{c.a} - {c.b} = {c.sub()}")
    print(f"{c.a} * {c.b} = {c.mul()}")
    print(f"{c.a} / {c.b} = {c.div()}")

print()
test()
