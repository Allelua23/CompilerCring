package symbols;

import generatorCode.AST.Id;

import java.util.HashMap;

public class SymbolTable {
    private HashMap<String, Id> table;
    protected SymbolTable prev;
    public SymbolTable(SymbolTable n) { table = new HashMap<>(); prev = n; }
    public void put(String v, Id i) { table.put(v, i); }
    public Id get(String t) {
        for (SymbolTable e = this; e != null; e = e.prev) {
            Id found = (e.table.get(t));
            if (found != null) return found;
        }
        return null;
    }
}
