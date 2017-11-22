#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#


def milimetro(m: float) -> float:
    return m * 1000


def main():
    m = float(input("Digite um valor em metros: "))
    mm = milimetro(m)
    print(f"Em milímetros {mm:.3f} (mm)")


main()
