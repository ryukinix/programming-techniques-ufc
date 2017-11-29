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
Questão 3)

Vamos construir uma aplicação simples de comando de linha de um bloco
de notas. O problema consiste em: notas curtas são armazenadas no
bloco de notas, cada nota deve gravar o dia que foi escrita e as tags
podem ser adicionadas para consultas fáceis. Deve ser possível também,
modificar as notas e procurar notas.

Autor: Wendley.

"""

# layer of compatibility for python2
from __future__ import unicode_literals, print_function, division
import sys
from datetime import datetime
import re

if sys.version_info < (3, 0):
    input = raw_input  # noqa


class NotePad(object):

    "A Group of notes as a application for add and search"

    def __init__(self):
        self.notes = []

    def search(self, pattern):
        "Filter the notes based on the pattern using Regular Expressions (yes)"
        print("== Matched notes for filter (regex): {!r}".format(pattern))
        empty = True
        for idx, note in enumerate(self.notes):
            if note.match(pattern):
                print('{}: {}'.format(idx, note))
                empty = False

        if empty:
            print("Empty search.")

    def new_note(self, text, tags=""):
        "Create a new note and add to the attribute self.notes"
        self.notes.append(Note(text, tags))

    def change_note(self, note_id, text):
        "Change the content of the text of a note by note_id"
        self.notes[note_id].text = text

    def change_tags(self, note_id, tags):
        "Change the content of the tags of a note by note_id"
        self.notes[note_id].tags = tags

    def remove_note(self, note_id):
        "Remove a note from self.notes list"
        del self.notes[note_id]

    def show_notes(self):
        "Print all the notes"
        print("== All notes as 'note_id: date | note | tags'")
        for idx, note in enumerate(self.notes):
            print('{}: {}'.format(idx, note))

    def menu(self):
        "Arg, so many ifs"
        while True:
            print("Select a option for:")
            print("  1. New note")
            print("  2. Edit note")
            print("  3. Edit tags")
            print("  4. Delete note")
            print("  5. Search for notes")
            print("  6. Show notes")
            print("  0. Exit")

            option = int(input("Option: "))
            if option == 1:
                text = input("Enter text: ")
                tags = input("Enter tags: ")
                self.new_note(text, tags)
            elif option in (2, 3, 4):
                note_id = int(input("Enter note id: "))
                if option == 2:
                    text = input("Enter new text: ")
                    self.change_note(note_id, text)
                elif option == 3:
                    tags = input("Enter tags: ")
                    self.change_tags(note_id, tags)
                elif option == 4:
                    self.remove_note(note_id)
            elif option == 5:
                self.search(input("Enter a pattern for search: "))
            elif option == 6:
                self.show_notes()
            elif option == 0:
                exit(0)
            else:
                print("Invalid option! Try again.")
                continue

            if option not in (5, 6):  # avoid double print
                self.show_notes()
            input("Press enter to continue...")
            print("\n\n\n\n\n\n")

    def run(self):
        try:
            self.menu()
        except Exception as e:
            print('Something bad happened: {}. Are you sane?'.format(e))
            self.run()


class Note(object):

    "Represent a unique note for that system"

    def __init__(self, text, tags):
        self.date = datetime.now()
        self.text = text
        self.tags = tags

    def match(self, pattern):
        return re.match(pattern, self.text) or re.match(pattern, self.tags)

    def __repr__(self):
        return '{} | {} | {!r}'.format(self.date.strftime("%d/%m/%Y %X"), self.text, self.tags)


if __name__ == '__main__':
    print(":: NOTEPAD SYSTEM 1.0 LOGIN")
    NotePad().run()
