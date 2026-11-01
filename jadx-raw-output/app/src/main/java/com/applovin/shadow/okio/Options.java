package com.applovin.shadow.okio;

import ck.i;
import ck.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import nj.d;
import nj.n;
import nj.s;
import nj.w;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Options extends d<ByteString> implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    /* JADX INFO: compiled from: Options.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final void buildTrieRecursive(long j10, Buffer buffer, int i10, List<? extends ByteString> list, int i11, int i12, List<Integer> list2) throws IOException {
            int i13;
            int i14;
            int i15;
            int i16 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (!(list.get(i17).size() >= i16)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i11);
            ByteString byteString2 = list.get(i12 - 1);
            int i18 = -1;
            if (i16 == byteString.size()) {
                int iIntValue = list2.get(i11).intValue();
                int i19 = i11 + 1;
                ByteString byteString3 = list.get(i19);
                i13 = i19;
                i14 = iIntValue;
                byteString = byteString3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (byteString.getByte(i16) == byteString2.getByte(i16)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i20 = 0;
                for (int i21 = i16; i21 < iMin && byteString.getByte(i21) == byteString2.getByte(i21); i21++) {
                    i20++;
                }
                long intCount = j10 + getIntCount(buffer) + ((long) 2) + ((long) i20) + 1;
                buffer.writeInt(-i20);
                buffer.writeInt(i14);
                int i22 = i16 + i20;
                while (i16 < i22) {
                    buffer.writeInt(byteString.getByte(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (!(i22 == list.get(i13).size())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    buffer.writeInt(list2.get(i13).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer2) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer2, i22, list, i13, i12, list2);
                    buffer.writeAll(buffer2);
                    return;
                }
            }
            int i23 = 1;
            for (int i24 = i13 + 1; i24 < i12; i24++) {
                if (list.get(i24 - 1).getByte(i16) != list.get(i24).getByte(i16)) {
                    i23++;
                }
            }
            long intCount2 = j10 + getIntCount(buffer) + ((long) 2) + ((long) (i23 * 2));
            buffer.writeInt(i23);
            buffer.writeInt(i14);
            for (int i25 = i13; i25 < i12; i25++) {
                byte b10 = list.get(i25).getByte(i16);
                if (i25 == i13 || b10 != list.get(i25 - 1).getByte(i16)) {
                    buffer.writeInt(b10 & 255);
                }
            }
            Buffer buffer3 = new Buffer();
            while (i13 < i12) {
                byte b11 = list.get(i13).getByte(i16);
                int i26 = i13 + 1;
                int i27 = i26;
                while (true) {
                    if (i27 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (b11 != list.get(i27).getByte(i16)) {
                            i15 = i27;
                            break;
                        }
                        i27++;
                    }
                }
                if (i26 == i15 && i16 + 1 == list.get(i13).size()) {
                    buffer.writeInt(list2.get(i13).intValue());
                } else {
                    buffer.writeInt(((int) (intCount2 + getIntCount(buffer3))) * i18);
                    buildTrieRecursive(intCount2, buffer3, i16 + 1, list, i13, i15, list2);
                }
                buffer3 = buffer3;
                i13 = i15;
                i18 = -1;
            }
            buffer.writeAll(buffer3);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j10, Buffer buffer, int i10, List list, int i11, int i12, List list2, int i13, Object obj) throws IOException {
            companion.buildTrieRecursive((i13 & 1) != 0 ? 0L : j10, buffer, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        public final Options of(ByteString... byteStringArr) throws IOException {
            p.j(byteStringArr, "byteStrings");
            int i10 = 0;
            i iVar = null;
            if (byteStringArr.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, iVar);
            }
            List listS0 = n.s0(byteStringArr);
            w.A(listS0);
            ArrayList arrayList = new ArrayList(byteStringArr.length);
            for (ByteString byteString : byteStringArr) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listQ = s.q(Arrays.copyOf(numArr, numArr.length));
            int length = byteStringArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                listQ.set(s.j(listS0, byteStringArr[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (!(((ByteString) listS0.get(0)).size() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i13 = 0;
            while (i13 < listS0.size()) {
                ByteString byteString2 = (ByteString) listS0.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listS0.size()) {
                    ByteString byteString3 = (ByteString) listS0.get(i15);
                    if (!byteString3.startsWith(byteString2)) {
                        break;
                    }
                    if (!(byteString3.size() != byteString2.size())) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                    }
                    if (((Number) listQ.get(i15)).intValue() > ((Number) listQ.get(i13)).intValue()) {
                        listS0.remove(i15);
                        listQ.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            Buffer buffer = new Buffer();
            buildTrieRecursive$default(this, 0L, buffer, 0, listS0, 0, 0, listQ, 53, null);
            int[] iArr = new int[(int) getIntCount(buffer)];
            while (!buffer.exhausted()) {
                iArr[i10] = buffer.readInt();
                i10++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStringArr, byteStringArr.length);
            p.i(objArrCopyOf, "copyOf(this, size)");
            return new Options((ByteString[]) objArrCopyOf, iArr, iVar);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / ((long) 4);
        }
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, i iVar) {
        this(byteStringArr, iArr);
    }

    public static final Options of(ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }

    @Override // nj.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @Override // nj.d, java.util.List
    public ByteString get(int i10) {
        return this.byteStrings[i10];
    }

    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // nj.d, nj.b
    public int getSize() {
        return this.byteStrings.length;
    }

    public final int[] getTrie$okio() {
        return this.trie;
    }

    @Override // nj.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // nj.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
