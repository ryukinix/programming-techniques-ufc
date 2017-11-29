#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#    @project: Prática 9 - Python
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#

from empregados import Empregados


def main():
    e1 = Empregados('Wendley', 'Silva', 8000)
    e2 = Empregados('Silvio', 'Santos', 1000000)
    e3 = Empregados('Bolsista', 'IC', -400)

    empregados = [e1, e2, e3]

    print(":: Empregados")
    for e in empregados:
        e.descreva()

    aumento = 0.12
    print(":: Aumento de salários! WOW! +{}%".format(aumento*100))
    for e in empregados:
        e.aumentar_salario(aumento)
        e.descreva()


if __name__ == '__main__':
    main()
