package com.bykv.vk.openvk.preload.geckox.model;

import com.bykv.vk.openvk.preload.falconx.a.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class UpdatePackage {
    private String accessKey;
    private String channel;
    private int channelIndex;
    private Content content;
    private String groupName;
    private long localVersion;
    private int packageType;
    private long version;

    public static class Content {
        private Package fullPackage;
        private Package patch;
        private Strategy strategy;

        public Content fromJson(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject;
            JSONObject jSONObjectOptJSONObject2;
            JSONObject jSONObjectOptJSONObject3;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("package") && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("package")) != null) {
                        Package r10 = new Package();
                        this.fullPackage = r10;
                        r10.fromJson(jSONObjectOptJSONObject3);
                    }
                    if (jSONObject.has("patch") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("patch")) != null) {
                        Package r11 = new Package();
                        this.patch = r11;
                        r11.fromJson(jSONObjectOptJSONObject2);
                    }
                    if (jSONObject.has("strategies") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("strategies")) != null) {
                        Strategy strategy = new Strategy();
                        this.strategy = strategy;
                        strategy.fromJson(jSONObjectOptJSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;
    }

    public static class Package {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public long f10683id;
        public long length;
        public String md5;

        @Deprecated
        public String url;
        public List<String> urlList;

        public Package() {
        }

        public void setId(int i10) {
            this.f10683id = i10;
        }

        public Package(int i10, List<String> list, String str) {
            this.f10683id = i10;
            this.urlList = list;
            this.md5 = str;
        }

        public Package fromJson(JSONObject jSONObject) {
            JSONArray jSONArrayOptJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("id")) {
                        this.f10683id = jSONObject.optLong("id");
                    }
                    if (jSONObject.has("url")) {
                        this.url = (String) a.a(jSONObject, "url", String.class);
                    }
                    if (jSONObject.has("url_list") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("url_list")) != null && jSONArrayOptJSONArray.length() > 0) {
                        this.urlList = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            this.urlList.add(jSONArrayOptJSONArray.optString(i10));
                        }
                    }
                    if (jSONObject.has("md5")) {
                        this.md5 = (String) a.a(jSONObject, "md5", String.class);
                    }
                    if (jSONObject.has("size")) {
                        this.length = jSONObject.optLong("size");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }

        public long getId() {
            return this.f10683id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public String toString() {
            return "Package{url='" + this.url + "', md5='" + this.md5 + "'}";
        }
    }

    public static class Strategy {
        private boolean deleteIfFail;
        private boolean deleteOldPackageBeforeDownload;
        private boolean needUnzip;

        public Strategy() {
        }

        public Strategy(int i10) {
            this.deleteIfFail = i10 == 1;
        }

        public Strategy fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("del_if_download_failed")) {
                        this.deleteIfFail = jSONObject.optBoolean("del_if_download_failed");
                    }
                    if (jSONObject.has("del_old_pkg_before_download")) {
                        this.deleteOldPackageBeforeDownload = jSONObject.optBoolean("del_old_pkg_before_download");
                    }
                    if (jSONObject.has("need_unzip")) {
                        this.needUnzip = jSONObject.optBoolean("need_unzip");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(boolean z10) {
            this.deleteIfFail = z10;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z10) {
            this.deleteOldPackageBeforeDownload = z10;
        }

        public void setNeedUnzip(boolean z10) {
            this.needUnzip = z10;
        }
    }

    public UpdatePackage() {
    }

    public UpdatePackage(long j10, String str, Package r10, Package r11) {
        this.version = j10;
        this.channel = str;
        Content content = new Content();
        this.content = content;
        content.fullPackage = r10;
        this.content.patch = r11;
    }

    public UpdatePackage fromJson(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("group_name")) {
                    this.groupName = (String) a.a(jSONObject, "group_name", String.class);
                }
                if (jSONObject.has("channel_index")) {
                    this.channelIndex = jSONObject.optInt("channel_index");
                }
                if (jSONObject.has("package_version")) {
                    this.version = jSONObject.optLong("package_version");
                }
                if (jSONObject.has("channel")) {
                    this.channel = (String) a.a(jSONObject, "channel", String.class);
                }
                if (jSONObject.has("content") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("content")) != null) {
                    Content content = new Content();
                    this.content = content;
                    content.fromJson(jSONObjectOptJSONObject);
                }
                if (jSONObject.has("localVersion")) {
                    this.localVersion = jSONObject.optLong("localVersion");
                }
                if (jSONObject.has("accessKey")) {
                    this.accessKey = (String) a.a(jSONObject, "accessKey", String.class);
                }
                if (jSONObject.has("package_type")) {
                    this.packageType = jSONObject.optInt("package_type");
                }
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public long getVersion() {
        return this.version;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i10) {
        this.channelIndex = i10;
    }

    public void setFullPackage(Package r10) {
        this.content.fullPackage = r10;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j10) {
        this.localVersion = j10;
    }

    public void setPatch(Package r10) {
        this.content.patch = r10;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setVersion(long j10) {
        this.version = j10;
    }

    public String toString() {
        return "UpdatePackage{version=" + this.version + ", channel='" + this.channel + "', content=" + this.content + ", packageType=" + this.packageType + '}';
    }

    public boolean isFullUpdate() {
        if (getFullPackage() != null && getFullPackage().getUrlList().size() > 0) {
            return true;
        }
        return false;
    }

    public boolean isPatchUpdate() {
        if (getPatch() != null && getPatch().getUrlList().size() > 0) {
            return true;
        }
        return false;
    }
}
