package sk.styk.martin.apkanalyzer.business.task;

import android.content.Context;

import java.util.List;

import sk.styk.martin.apkanalyzer.business.service.AppBasicDataService;
import sk.styk.martin.apkanalyzer.business.service.AppDetailDataService;
import sk.styk.martin.apkanalyzer.model.detail.AppDetailData;
import sk.styk.martin.apkanalyzer.model.list.AppListData;

/**
 * Loader async task for item for AppListDialog
 * <p>
 * Created by Martin Styk on 05.01.2018.
 */
public class AppListFromPackageNamesLoader extends ApkAnalyzerAbstractAsyncLoader<List<AppListData>> {

    public static final int ID = 5;
    private final AppBasicDataService appBasicDataService;

    private List<String> packageNames;

    public AppListFromPackageNamesLoader(Context context, List<String> packageNames) {
        super(context);
        this.packageNames = packageNames;
        appBasicDataService = new AppBasicDataService(context.getPackageManager());
    }

    @Override
    public List<AppListData> loadInBackground() {
        return appBasicDataService.getForPackageNames(packageNames);
    }

}

