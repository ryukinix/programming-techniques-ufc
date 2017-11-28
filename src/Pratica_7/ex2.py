#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#

def main():
    num = int(input("Digite um inteiro: "))
    soma = 0

    while num != 0:
        soma = soma + num
        num = int(input("Digite um inteiro: "))

    print("A soma eh", soma)

main()