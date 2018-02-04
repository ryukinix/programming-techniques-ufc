#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#    @project: AP3 - T.P
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#


class Veiculos(object):

    def __init__(self, nome, ano, preco):
        self.set_nome(nome)
        self.set_ano(ano)
        self.set_preco(preco)

    def set_nome(self, nome):
        self.nome = nome

    def get_nome(self):
        return self.nome

    def set_ano(self, ano):
        self.ano = ano

    def get_ano(self):
        return self.ano

    def set_preco(self, preco):
        self.preco = preco

    def get_preco(self):
        return self.preco

    def describe(self):
        print("Class: {}".format(self.__class__.__name__))
        print("Nome: {}".format(self.get_nome()))
        print("Ano: {}".format(self.get_ano()))
        print("Preco: {}".format(self.get_preco()))
