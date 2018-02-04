#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#    @project: AP3 - T.P
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#


def polegada_para_cm(polegada):
    return polegada * 2.54


def pe_para_cm(pe):
    return pe * 30.48


def main():
    i = int(input("Selecione: (1) polegada->cm (2) pé->cm: "))
    n = int(input("Digite o valor: "))
    if i == 1:
        unidade = "polegadas"
        resultado = polegada_para_cm(n)
    elif i == 2:
        unidade = "pés"
        resultado = pe_para_cm(n)
    else:
        print("Você tá louco. Tente novamente")
        main()

    print("{n} {unidade} equivale a {resultado} cm".format(
        n=n,
        unidade=unidade,
        resultado=resultado
    ))

print()
main()
