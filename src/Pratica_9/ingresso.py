#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#    @project: Prática 9 - Python
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#


class Ingresso(object):

    def __init__(self, valor):
        self._valor = valor

    def imprime_valor(self):
        print("{}: R$ {:,.2f}".format(self.__class__.__name__,
                                      self.valor))

    @property
    def valor(self):
        return self._valor

    @valor.setter
    def valor(self, valor):
        self._valor = valor
