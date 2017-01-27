package com.mcsearchin.pencil

import spock.lang.Specification

class PaperSpec extends Specification {

    static final TEXT = "text"

    Paper subject

    def setup() {
        subject = new Paper()
    }

    def "when text is written it contains the text"() {
        when:
        subject.write(TEXT)

        then:
        subject.text == TEXT
    }

    def "given text has already been written, when more text is written then it is appended to the existing text"() {
        given:
        subject.write(TEXT)

        when:
        subject.write(TEXT)

        then:
        subject.text == TEXT + TEXT
    }
}
