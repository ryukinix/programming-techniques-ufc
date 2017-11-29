#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#    @project: Prática 9 - Python
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#

from ingresso import Ingresso

class VIP(Ingresso):

    @property
    def valor(self):
        return self._valor + self._valor/2
