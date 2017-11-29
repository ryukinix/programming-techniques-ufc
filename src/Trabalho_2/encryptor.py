#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#    Copyright © 2017 Manoel Vilela
#
#    @project: Técnicas de Programação - Trabalho 2
#     @author: Manoel Vilela
#      @email: manoel_vilela@engineer.com
#


"""
Questão 2)

Uma empresa quer transmitir dados por telefone, mas está preocupada
com a possibilidade de seus telefones estarem grampeados. Ela pediu
para você escrever um programa que criptografe os dados de modo que
estes possam ser transmitidos mais seguramente. Todos os dados são
transmitidos como inteiros de quatro dígitos. Você deve conseguir ler
um inteiro de quatro dígitos inserido pelo usuário e criptografá-lo
desta maneira: Substitua cada digito pelo resultado da adição de 6 ao
dígito e obtendo o resto depois da divisão do novo valor por
10. Troque então o primeiro dígito pelo terceiro e o segundo digito
pelo quarto. Então imprima o inteiro criptografado. Escreva um
programa principal que receba entrada de um inteiro de quatro dígitos
criptografado e o descriptografe para formar o número original.

Author: Wendley.

"""

# layer of compatibility for python2
from __future__ import unicode_literals
from __future__ import print_function
from __future__ import division


def is_valid(string):
    "Checa se a string é válida para ser encriptografada"
    return string.isdecimal() and len(string) <= 4


def swap_digits(string):
    encrypted = list(string.zfill(4))  # normalize data (fill with zeros)
    encrypted[0], encrypted[2] = encrypted[2], encrypted[0]
    encrypted[1], encrypted[3] = encrypted[3], encrypted[1]
    return encrypted


def encrypt(data):
    """Encriptografa um conjunto de dados e retorna.

    :data: uma string de 4 dígitos.
    :return: string criptografada
    """
    encrypted = [(x + 6) % 10 for x in map(int, swap_digits(data))]
    return ''.join(map(str, encrypted))


def decrypt(data):
    """Descriptografa um conjunto de dados e retorna.

    :data: Data é um inteiro de 4 digitos.
    :return: string descriptografada
    """
    encrypted = [(x + 4) % 10 for x in map(int, swap_digits(data))]
    return ''.join(map(str, encrypted))


def main():
    "Função principal para execução e leitura da entrada"
    while True:
        data = input("Enter a number between [0,9999] or type -1 to exit: ")
        if is_valid(data):
            print("The decrypted is equal to: {}".format(decrypt(data)))
        elif data == '-1':
            print("Exiting...")
            break
        else:
            print("Error! Try again.")
            continue


def tests():
    "Função destinada para testes em desenvolvimento"
    # (decrypted, encrypted)
    tests_table = [('1234', '9078'),
                   ('0000', '6666'),
                   ('4444', '0000')]

    # teste cruzado de encriptação e decriptação
    # através da tabela de testes com tuplas
    # (decrypted, encrypted)
    print("== RUNNING AUTOMATIZED TESTS")
    print(":: read as 'encrypted -> decrypted'")
    for decrypted, encrypted in tests_table:
        print(':: {} -> {}'.format(encrypt(decrypted), decrypt(encrypted)))
        assert decrypt(encrypted) == decrypted
        assert encrypt(decrypted) == encrypted

    print("Tests successfully passed.")


if __name__ == '__main__':
    main()
    tests()
