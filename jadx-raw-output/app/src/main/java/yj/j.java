package yj;

import ck.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class j implements kk.i<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedReader f85777a;

    /* JADX INFO: compiled from: ReadWrite.kt */
    public static final class a implements Iterator<String>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f85778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f85779c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f85778b == null && !this.f85779c) {
                String line = j.this.f85777a.readLine();
                this.f85778b = line;
                if (line == null) {
                    this.f85779c = true;
                }
            }
            return this.f85778b != null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (hasNext()) {
                String str = this.f85778b;
                this.f85778b = null;
                p.g(str);
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public j(BufferedReader bufferedReader) {
        p.j(bufferedReader, "reader");
        this.f85777a = bufferedReader;
    }

    @Override // kk.i
    public Iterator<String> iterator() {
        return new a();
    }
}
