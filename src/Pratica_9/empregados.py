#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#    @project: Prática 9 - Python
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#


class Empregados(object):

    def __init__(self, nome, sobrenome, salario):
        self.nome = nome
        self.sobrenome = sobrenome
        self.salario = salario

    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, nome):
        self._nome = nome

    @property
    def sobrenome(self):
        return self._sobrenome

    @sobrenome.setter
    def sobrenome(self, sobrenome):
        self._sobrenome = sobrenome

    @property
    def salario(self):
        return self._salario

    @salario.setter
    def salario(self, salario):
        self._salario = salario if salario >= 0 else 100

    def aumentar_salario(self, porcentagem):
        self.salario += self.salario*porcentagem

    def descreva(self):
        print('== Empregado')
        print('nome: {}'.format(self.nome))
        print('sobrenome: {}'.format(self.sobrenome))
        print('salario: R$ {:,.2f}'.format(self.salario))
