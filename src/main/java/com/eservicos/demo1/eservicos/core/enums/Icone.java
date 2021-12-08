package com.eservicos.demo1.eservicos.core.enums;

public enum Icone {

        TWF_CLEANIN_1("twf-cleanin-1"),
        TWF_CLEANIN_2("twf-cleanin-2"),
        TWF_CLEANIN_3("twf-cleanin-3");

        private String nome;

        private Icone(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
}
