package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: classes6.dex */
public enum WriteMode {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public final char begin;
    public final char end;

    WriteMode(char c10, char c11) {
        this.begin = c10;
        this.end = c11;
    }
}
