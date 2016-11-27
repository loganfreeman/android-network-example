package com.raywenderlich.reposearch;

import java.util.ArrayList;

/**
 * Created by scheng on 11/27/16.
 */

public interface DownloadCompleteListener {
    void downloadComplete(ArrayList<Repository> repositories);
}
