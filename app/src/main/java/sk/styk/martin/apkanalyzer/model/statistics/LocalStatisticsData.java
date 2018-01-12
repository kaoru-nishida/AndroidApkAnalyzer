package sk.styk.martin.apkanalyzer.model.statistics;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sk.styk.martin.apkanalyzer.model.detail.AppSource;
import sk.styk.martin.apkanalyzer.util.PercentagePair;

/**
 * Created by Martin Styk on 28.07.2017.
 */

public class LocalStatisticsData implements Parcelable {

    private PercentagePair analyzeSuccess;
    private PercentagePair analyzeFailed;
    private PercentagePair systemApps;

    private Map<String, List<String>> installLocation;
    private Map<Integer, List<String>> targetSdk;
    private Map<Integer, List<String>> minSdk;

    private Map<AppSource, List<String>> appSource;

    private MathStatistics apkSize;

    private Map<String, List<String>> signAlgorithm;

    private MathStatistics activites;
    private MathStatistics services;
    private MathStatistics providers;
    private MathStatistics receivers;

    private MathStatistics usedPermissions;
    private MathStatistics definedPermissions;

    private MathStatistics files;

    private MathStatistics drawables;
    private MathStatistics differentDrawables;

    private MathStatistics layouts;
    private MathStatistics differentLayouts;

    public PercentagePair getAnalyzeSuccess() {
        return analyzeSuccess;
    }

    public void setAnalyzeSuccess(PercentagePair analyzeSuccess) {
        this.analyzeSuccess = analyzeSuccess;
    }

    public PercentagePair getAnalyzeFailed() {
        return analyzeFailed;
    }

    public void setAnalyzeFailed(PercentagePair analyzeFailed) {
        this.analyzeFailed = analyzeFailed;
    }

    public PercentagePair getSystemApps() {
        return systemApps;
    }

    public void setSystemApps(PercentagePair systemApps) {
        this.systemApps = systemApps;
    }

    public Map<String, List<String>> getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(Map<String, List<String>> installLocation) {
        this.installLocation = installLocation;
    }

    public Map<Integer, List<String>> getTargetSdk() {
        return targetSdk;
    }

    public void setTargetSdk(Map<Integer, List<String>> targetSdk) {
        this.targetSdk = targetSdk;
    }

    public Map<Integer, List<String>> getMinSdk() {
        return minSdk;
    }

    public void setMinSdk(Map<Integer, List<String>> minSdk) {
        this.minSdk = minSdk;
    }

    public MathStatistics getApkSize() {
        return apkSize;
    }

    public void setApkSize(MathStatistics apkSize) {
        this.apkSize = apkSize;
    }

    public Map<String, List<String>> getSignAlgorithm() {
        return signAlgorithm;
    }

    public void setSignAlgorithm(Map<String, List<String>> signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
    }

    public MathStatistics getActivites() {
        return activites;
    }

    public void setActivites(MathStatistics activites) {
        this.activites = activites;
    }

    public Map<AppSource, List<String>> getAppSource() {
        return appSource;
    }

    public void setAppSource(Map<AppSource, List<String>> appSource) {
        this.appSource = appSource;
    }

    public MathStatistics getServices() {
        return services;
    }

    public void setServices(MathStatistics services) {
        this.services = services;
    }

    public MathStatistics getProviders() {
        return providers;
    }

    public void setProviders(MathStatistics providers) {
        this.providers = providers;
    }

    public MathStatistics getReceivers() {
        return receivers;
    }

    public void setReceivers(MathStatistics receivers) {
        this.receivers = receivers;
    }

    public MathStatistics getUsedPermissions() {
        return usedPermissions;
    }

    public void setUsedPermissions(MathStatistics usedPermissions) {
        this.usedPermissions = usedPermissions;
    }

    public MathStatistics getDefinedPermissions() {
        return definedPermissions;
    }

    public void setDefinedPermissions(MathStatistics definedPermissions) {
        this.definedPermissions = definedPermissions;
    }

    public MathStatistics getFiles() {
        return files;
    }

    public void setFiles(MathStatistics files) {
        this.files = files;
    }

    public MathStatistics getDrawables() {
        return drawables;
    }

    public void setDrawables(MathStatistics drawables) {
        this.drawables = drawables;
    }

    public MathStatistics getDifferentDrawables() {
        return differentDrawables;
    }

    public void setDifferentDrawables(MathStatistics differentDrawables) {
        this.differentDrawables = differentDrawables;
    }

    public MathStatistics getLayouts() {
        return layouts;
    }

    public void setLayouts(MathStatistics layouts) {
        this.layouts = layouts;
    }

    public MathStatistics getDifferentLayouts() {
        return differentLayouts;
    }

    public void setDifferentLayouts(MathStatistics differentLayouts) {
        this.differentLayouts = differentLayouts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalStatisticsData data = (LocalStatisticsData) o;

        if (analyzeSuccess != null ? !analyzeSuccess.equals(data.analyzeSuccess) : data.analyzeSuccess != null)
            return false;
        if (analyzeFailed != null ? !analyzeFailed.equals(data.analyzeFailed) : data.analyzeFailed != null)
            return false;
        if (systemApps != null ? !systemApps.equals(data.systemApps) : data.systemApps != null)
            return false;
        if (installLocation != null ? !installLocation.equals(data.installLocation) : data.installLocation != null)
            return false;
        if (targetSdk != null ? !targetSdk.equals(data.targetSdk) : data.targetSdk != null)
            return false;
        if (minSdk != null ? !minSdk.equals(data.minSdk) : data.minSdk != null) return false;
        if (appSource != null ? !appSource.equals(data.appSource) : data.appSource != null)
            return false;
        if (apkSize != null ? !apkSize.equals(data.apkSize) : data.apkSize != null) return false;
        if (signAlgorithm != null ? !signAlgorithm.equals(data.signAlgorithm) : data.signAlgorithm != null)
            return false;
        if (activites != null ? !activites.equals(data.activites) : data.activites != null)
            return false;
        if (services != null ? !services.equals(data.services) : data.services != null)
            return false;
        if (providers != null ? !providers.equals(data.providers) : data.providers != null)
            return false;
        if (receivers != null ? !receivers.equals(data.receivers) : data.receivers != null)
            return false;
        if (usedPermissions != null ? !usedPermissions.equals(data.usedPermissions) : data.usedPermissions != null)
            return false;
        if (definedPermissions != null ? !definedPermissions.equals(data.definedPermissions) : data.definedPermissions != null)
            return false;
        if (files != null ? !files.equals(data.files) : data.files != null) return false;
        if (drawables != null ? !drawables.equals(data.drawables) : data.drawables != null)
            return false;
        if (differentDrawables != null ? !differentDrawables.equals(data.differentDrawables) : data.differentDrawables != null)
            return false;
        if (layouts != null ? !layouts.equals(data.layouts) : data.layouts != null) return false;
        return differentLayouts != null ? differentLayouts.equals(data.differentLayouts) : data.differentLayouts == null;

    }

    @Override
    public int hashCode() {
        int result = analyzeSuccess != null ? analyzeSuccess.hashCode() : 0;
        result = 31 * result + (analyzeFailed != null ? analyzeFailed.hashCode() : 0);
        result = 31 * result + (systemApps != null ? systemApps.hashCode() : 0);
        result = 31 * result + (installLocation != null ? installLocation.hashCode() : 0);
        result = 31 * result + (targetSdk != null ? targetSdk.hashCode() : 0);
        result = 31 * result + (minSdk != null ? minSdk.hashCode() : 0);
        result = 31 * result + (appSource != null ? appSource.hashCode() : 0);
        result = 31 * result + (apkSize != null ? apkSize.hashCode() : 0);
        result = 31 * result + (signAlgorithm != null ? signAlgorithm.hashCode() : 0);
        result = 31 * result + (activites != null ? activites.hashCode() : 0);
        result = 31 * result + (services != null ? services.hashCode() : 0);
        result = 31 * result + (providers != null ? providers.hashCode() : 0);
        result = 31 * result + (receivers != null ? receivers.hashCode() : 0);
        result = 31 * result + (usedPermissions != null ? usedPermissions.hashCode() : 0);
        result = 31 * result + (definedPermissions != null ? definedPermissions.hashCode() : 0);
        result = 31 * result + (files != null ? files.hashCode() : 0);
        result = 31 * result + (drawables != null ? drawables.hashCode() : 0);
        result = 31 * result + (differentDrawables != null ? differentDrawables.hashCode() : 0);
        result = 31 * result + (layouts != null ? layouts.hashCode() : 0);
        result = 31 * result + (differentLayouts != null ? differentLayouts.hashCode() : 0);
        return result;
    }

    public LocalStatisticsData() {
    }

    @Override
    public String toString() {
        return "LocalStatisticsData{" +
                "analyzeSuccess=" + analyzeSuccess +
                ", analyzeFailed=" + analyzeFailed +
                ", systemApps=" + systemApps +
                ", installLocation=" + installLocation +
                ", targetSdk=" + targetSdk +
                ", minSdk=" + minSdk +
                ", appSource=" + appSource +
                ", apkSize=" + apkSize +
                ", signAlgorithm=" + signAlgorithm +
                ", activites=" + activites +
                ", services=" + services +
                ", providers=" + providers +
                ", receivers=" + receivers +
                ", usedPermissions=" + usedPermissions +
                ", definedPermissions=" + definedPermissions +
                ", files=" + files +
                ", drawables=" + drawables +
                ", differentDrawables=" + differentDrawables +
                ", layouts=" + layouts +
                ", differentLayouts=" + differentLayouts +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.analyzeSuccess, flags);
        dest.writeParcelable(this.analyzeFailed, flags);
        dest.writeParcelable(this.systemApps, flags);
        dest.writeInt(this.installLocation.size());
        for (Map.Entry<String, List<String>> entry : this.installLocation.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeStringList(entry.getValue());
        }
        dest.writeInt(this.targetSdk.size());
        for (Map.Entry<Integer, List<String>> entry : this.targetSdk.entrySet()) {
            dest.writeValue(entry.getKey());
            dest.writeStringList(entry.getValue());
        }
        dest.writeInt(this.minSdk.size());
        for (Map.Entry<Integer, List<String>> entry : this.minSdk.entrySet()) {
            dest.writeValue(entry.getKey());
            dest.writeStringList(entry.getValue());
        }
        dest.writeInt(this.appSource.size());
        for (Map.Entry<AppSource, List<String>> entry : this.appSource.entrySet()) {
            dest.writeInt(entry.getKey() == null ? -1 : entry.getKey().ordinal());
            dest.writeStringList(entry.getValue());
        }
        dest.writeParcelable(this.apkSize, flags);
        dest.writeInt(this.signAlgorithm.size());
        for (Map.Entry<String, List<String>> entry : this.signAlgorithm.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeStringList(entry.getValue());
        }
        dest.writeParcelable(this.activites, flags);
        dest.writeParcelable(this.services, flags);
        dest.writeParcelable(this.providers, flags);
        dest.writeParcelable(this.receivers, flags);
        dest.writeParcelable(this.usedPermissions, flags);
        dest.writeParcelable(this.definedPermissions, flags);
        dest.writeParcelable(this.files, flags);
        dest.writeParcelable(this.drawables, flags);
        dest.writeParcelable(this.differentDrawables, flags);
        dest.writeParcelable(this.layouts, flags);
        dest.writeParcelable(this.differentLayouts, flags);
    }

    protected LocalStatisticsData(Parcel in) {
        this.analyzeSuccess = in.readParcelable(PercentagePair.class.getClassLoader());
        this.analyzeFailed = in.readParcelable(PercentagePair.class.getClassLoader());
        this.systemApps = in.readParcelable(PercentagePair.class.getClassLoader());
        int installLocationSize = in.readInt();
        this.installLocation = new HashMap<String, List<String>>(installLocationSize);
        for (int i = 0; i < installLocationSize; i++) {
            String key = in.readString();
            List<String> value = in.createStringArrayList();
            this.installLocation.put(key, value);
        }
        int targetSdkSize = in.readInt();
        this.targetSdk = new HashMap<Integer, List<String>>(targetSdkSize);
        for (int i = 0; i < targetSdkSize; i++) {
            Integer key = (Integer) in.readValue(Integer.class.getClassLoader());
            List<String> value = in.createStringArrayList();
            this.targetSdk.put(key, value);
        }
        int minSdkSize = in.readInt();
        this.minSdk = new HashMap<Integer, List<String>>(minSdkSize);
        for (int i = 0; i < minSdkSize; i++) {
            Integer key = (Integer) in.readValue(Integer.class.getClassLoader());
            List<String> value = in.createStringArrayList();
            this.minSdk.put(key, value);
        }
        int appSourceSize = in.readInt();
        this.appSource = new HashMap<AppSource, List<String>>(appSourceSize);
        for (int i = 0; i < appSourceSize; i++) {
            int tmpKey = in.readInt();
            AppSource key = tmpKey == -1 ? null : AppSource.values()[tmpKey];
            List<String> value = in.createStringArrayList();
            this.appSource.put(key, value);
        }
        this.apkSize = in.readParcelable(MathStatistics.class.getClassLoader());
        int signAlgorithmSize = in.readInt();
        this.signAlgorithm = new HashMap<String, List<String>>(signAlgorithmSize);
        for (int i = 0; i < signAlgorithmSize; i++) {
            String key = in.readString();
            List<String> value = in.createStringArrayList();
            this.signAlgorithm.put(key, value);
        }
        this.activites = in.readParcelable(MathStatistics.class.getClassLoader());
        this.services = in.readParcelable(MathStatistics.class.getClassLoader());
        this.providers = in.readParcelable(MathStatistics.class.getClassLoader());
        this.receivers = in.readParcelable(MathStatistics.class.getClassLoader());
        this.usedPermissions = in.readParcelable(MathStatistics.class.getClassLoader());
        this.definedPermissions = in.readParcelable(MathStatistics.class.getClassLoader());
        this.files = in.readParcelable(MathStatistics.class.getClassLoader());
        this.drawables = in.readParcelable(MathStatistics.class.getClassLoader());
        this.differentDrawables = in.readParcelable(MathStatistics.class.getClassLoader());
        this.layouts = in.readParcelable(MathStatistics.class.getClassLoader());
        this.differentLayouts = in.readParcelable(MathStatistics.class.getClassLoader());
    }

    public static final Creator<LocalStatisticsData> CREATOR = new Creator<LocalStatisticsData>() {
        @Override
        public LocalStatisticsData createFromParcel(Parcel source) {
            return new LocalStatisticsData(source);
        }

        @Override
        public LocalStatisticsData[] newArray(int size) {
            return new LocalStatisticsData[size];
        }
    };
}
