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
from carros import Carros


def main():
    v = Veiculos("CB 600", 2006, 36000)
    c = Carros("Corola", 2012, 40000, 4)

    v.describe()
    c.describe()


print()
main()
