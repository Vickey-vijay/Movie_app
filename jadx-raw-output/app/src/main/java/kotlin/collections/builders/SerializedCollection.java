package kotlin.collections.builders;

import ck.i;
import ck.p;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nj.p0;
import nj.r;
import nj.s;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class SerializedCollection implements Externalizable {
    public static final a Companion = new a(null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    private Collection<?> collection;
    private final int tag;

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public SerializedCollection(Collection<?> collection, int i10) {
        p.j(collection, "collection");
        this.collection = collection;
        this.tag = i10;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        Collection<?> collectionA;
        p.j(objectInput, "input");
        byte b10 = objectInput.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10) + '.');
        }
        int i11 = objectInput.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i11 + '.');
        }
        int i12 = 0;
        if (i10 == 0) {
            List listD = r.d(i11);
            while (i12 < i11) {
                listD.add(objectInput.readObject());
                i12++;
            }
            collectionA = r.a(listD);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
            }
            Set setC = p0.c(i11);
            while (i12 < i11) {
                setC.add(objectInput.readObject());
                i12++;
            }
            collectionA = p0.a(setC);
        }
        this.collection = collectionA;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        p.j(objectOutput, "output");
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public SerializedCollection() {
        this(s.k(), 0);
    }
}
