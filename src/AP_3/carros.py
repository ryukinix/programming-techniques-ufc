#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#    @project: <project>
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#


from veiculos import Veiculos


class Carros(Veiculos):

    def __init__(self, nome, ano, preco, portas):
        super().__init__(nome, ano, preco)
        self.set_portas(portas)

    def set_portas(self, portas):
        self.portas = portas

    def get_portas(self):
        return self.portas

    def describe(self):
        super().describe()
        print("Portas: {}".format(self.get_portas()))
