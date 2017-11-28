#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#


def minutos(s: int) -> int:
    return (s//60) % (60)


def horas(s: int) -> int:
    return (s//(60*60)) % 24


def dias(s: int) -> int:
    return (s//(60*60*24))


def segundos(s: int) -> int:
    return s % 60


def main():
    seg = int(input("Digite um valor em segundos: "))
    h = horas(seg)
    d = dias(seg)
    m = minutos(seg)
    s = segundos(seg)
    print(f'{seg} (s) => {d} dias, {h} horas, {m} min e {s} segundos')

main()
