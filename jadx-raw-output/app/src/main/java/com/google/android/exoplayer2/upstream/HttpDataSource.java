package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import e5.h;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface HttpDataSource extends com.google.android.exoplayer2.upstream.a {

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, h hVar) {
            super("Invalid content type: " + str, hVar, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final int responseCode;

        @Nullable
        public final String responseMessage;

        @Deprecated
        public InvalidResponseCodeException(int i10, Map<String, List<String>> map, h hVar) {
            this(i10, null, map, hVar);
        }

        public InvalidResponseCodeException(int i10, @Nullable String str, Map<String, List<String>> map, h hVar) {
            super("Response code: " + i10, hVar, 1);
            this.responseCode = i10;
            this.responseMessage = str;
            this.headerFields = map;
        }
    }

    public static abstract class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f20056a = new c();

        public abstract HttpDataSource b(c cVar);

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0188a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HttpDataSource createDataSource() {
            return b(this.f20056a);
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.b
        public final c getDefaultRequestProperties() {
            return this.f20056a;
        }
    }

    public interface b extends com.google.android.exoplayer2.upstream.a.InterfaceC0188a {
        c getDefaultRequestProperties();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, String> f20057a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f20058b;

        public synchronized Map<String, String> a() {
            if (this.f20058b == null) {
                this.f20058b = Collections.unmodifiableMap(new HashMap(this.f20057a));
            }
            return this.f20058b;
        }

        public synchronized void b(String str, String str2) {
            this.f20058b = null;
            this.f20057a.put(str, str2);
        }
    }

    public static class HttpDataSourceException extends IOException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final h dataSpec;
        public final int type;

        public HttpDataSourceException(h hVar, int i10) {
            this.dataSpec = hVar;
            this.type = i10;
        }

        public HttpDataSourceException(String str, h hVar, int i10) {
            super(str);
            this.dataSpec = hVar;
            this.type = i10;
        }

        public HttpDataSourceException(IOException iOException, h hVar, int i10) {
            super(iOException);
            this.dataSpec = hVar;
            this.type = i10;
        }

        public HttpDataSourceException(String str, IOException iOException, h hVar, int i10) {
            super(str, iOException);
            this.dataSpec = hVar;
            this.type = i10;
        }
    }
}
