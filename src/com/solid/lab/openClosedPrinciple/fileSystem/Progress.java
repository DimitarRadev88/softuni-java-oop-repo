package com.solid.lab.openClosedPrinciple.fileSystem;

public class Progress {
    private final File file;
    private int sent;

    public Progress(File file) {
        this.file = file;
    }

    public void setSent(int sent) {
        this.sent = sent;
    }

    public int getSent() {
        return sent;
    }

    public int getCurrentPercent() {
        return sent * 100 / this.file.getLength();
    }

}
