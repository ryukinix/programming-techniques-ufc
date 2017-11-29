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
from vip import VIP
from camarote_superior import CamaroteSuperior


def main():
    ing = Ingresso(100)
    vip = VIP(100)
    cam = CamaroteSuperior(100, 'norte')

    ing.imprime_valor()
    vip.imprime_valor()
    cam.imprime_valor()
    cam.imprime_local()

if __name__ == '__main__':
    main()
