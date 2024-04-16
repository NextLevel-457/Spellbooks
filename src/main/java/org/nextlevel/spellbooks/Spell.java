package org.nextlevel.spellbooks;

public class Spell {
    public double range = 5.0;

    public enum Form {RAYCAST, AOE, BLOCK}

    public Form form;

    public Spell(double range, Form form) {
        this.range = range;
        this.form = form;
    }
}
