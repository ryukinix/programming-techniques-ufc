#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#    @project: AP3 - T.P
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#

from random import randint
import math


def main():
    a, b = 0, 80
    l = [randint(a, b) for x in range(3)]
    n = int(input("Digite um número: "))
    l.append(math.sqrt(n))
    l.append(math.log(n))
    print(l)

print()
main()
