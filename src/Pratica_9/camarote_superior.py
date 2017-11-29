#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#    @project: Prática 9 - Python
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#

from vip import VIP


class CamaroteSuperior(VIP):

    def __init__(self, valor, local):
        super().__init__(valor)
        self.local = local

    @property
    def local(self):
        return self._local

    @local.setter
    def local(self, local):
        self._local = local

    def imprime_local(self):
        print('Local: {}'.format(self.local))
