package com.mmlm.shici.module.util.network;

import com.mmlm.shici.module.util.beans.BAppSettings;
import com.mmlm.shici.module.util.beans.BUserInfo;
import com.mmlm.shici.module.util.beans.NetResult;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2018/4/28.
 */

public interface RequestApi {
    @GET("Api/getAppSettings")
    Observable<NetResult<BAppSettings>> getAppSettings();

    @GET("Api/register")
    Observable<NetResult<BUserInfo>> register(@QueryMap Map<String, Object> map);

    @GET("Api/login")
    Observable<NetResult<BUserInfo>> login(@Query("userName") String userName, @Query("password") String password);
}
