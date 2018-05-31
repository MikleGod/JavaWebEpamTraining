package model.entity;

public enum PunctuationMark{
    WHITE_SPACE(new Word(" ")),
    COMMA(new Word(",")),
    DOT(new Word(".")),
    COLON(new Word(":")),
    SEMICOLON(new Word(";")),
    ELLIPSIS(new Word("...")),
    QUOTES(new Word("\""));

    private final Word word;

    PunctuationMark(Word word) {
        this.word = word;
    }

    public Word getWord() {
        return word;
    }
}
