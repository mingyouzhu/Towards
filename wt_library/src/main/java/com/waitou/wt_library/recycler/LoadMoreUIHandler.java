package com.waitou.wt_library.recycler;

/**
 * Created by wanglei on 2016/10/30.
 */

public interface LoadMoreUIHandler {
    void onLoading();

    void onLoadFinish(boolean hasMore);

    void onErrorMore(String des);


}
