package com.mcsearchin.pencil

class Eraser {

    private int durability

    Eraser(int durability) {
        this.durability = durability
    }

    def erase(String text, Paper paper) {
        def start = paper.text.lastIndexOf(text)
        if (start >= 0) {
            def end = start + text.length() - 1
            (end..start).each {
                if (!isWornOut()) {
                    eraseAndDegrade(paper, it)
                }
            }
        }
    }

    private eraseAndDegrade(Paper paper, int atIndex) {
        paper.erase(atIndex)
        durability--
    }

    private isWornOut() {
        return durability < 1
    }
}
