#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#


def fatorial(n: int) -> int:
    if n < 2:
        return 1
    return n * fatorial(n - 1)


def main():
    n = int(input("Entre com um inteiro n: "))
    f = fatorial(n)
    print(f"Fatorial de {n} é {f}.")

main()
