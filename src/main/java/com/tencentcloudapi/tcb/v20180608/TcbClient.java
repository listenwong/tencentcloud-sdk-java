/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tcb.v20180608;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcb.v20180608.models.*;

public class TcbClient extends AbstractClient{
    private static String endpoint = "tcb.tencentcloudapi.com";
    private static String version = "2018-06-08";

    public TcbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcbClient(Credential credential, String region, ClientProfile profile) {
        super(TcbClient.endpoint, TcbClient.version, credential, region, profile);
    }

    /**
     *TCB云API统一入口
     * @param req CommonServiceAPIRequest
     * @return CommonServiceAPIResponse
     * @throws TencentCloudSDKException
     */
    public CommonServiceAPIResponse CommonServiceAPI(CommonServiceAPIRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CommonServiceAPIResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CommonServiceAPIResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CommonServiceAPI"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建mysql实例
     * @param req CreateMysqlInstanceRequest
     * @return CreateMysqlInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMysqlInstanceResponse CreateMysqlInstance(CreateMysqlInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMysqlInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMysqlInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMysqlInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取数据库权限
     * @param req DescribeDatabaseACLRequest
     * @return DescribeDatabaseACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseACLResponse DescribeDatabaseACL(DescribeDatabaseACLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatabaseACLResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabaseACLResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDatabaseACL"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取环境列表，含环境下的各个资源信息。尤其是各资源的唯一标识，是请求各资源的关键参数
     * @param req DescribeEnvsRequest
     * @return DescribeEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvsResponse DescribeEnvs(DescribeEnvsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeEnvs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *隔离mysql实例
     * @param req IsolateMysqlInstanceRequest
     * @return IsolateMysqlInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateMysqlInstanceResponse IsolateMysqlInstance(IsolateMysqlInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateMysqlInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateMysqlInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "IsolateMysqlInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改数据库权限
     * @param req ModifyDatabaseACLRequest
     * @return ModifyDatabaseACLResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseACLResponse ModifyDatabaseACL(ModifyDatabaseACLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDatabaseACLResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDatabaseACLResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDatabaseACL"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新环境信息
     * @param req ModifyEnvRequest
     * @return ModifyEnvResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvResponse ModifyEnv(ModifyEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEnvResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEnvResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyEnv"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下线mysql实例
     * @param req OfflineMysqlInstanceRequest
     * @return OfflineMysqlInstanceResponse
     * @throws TencentCloudSDKException
     */
    public OfflineMysqlInstanceResponse OfflineMysqlInstance(OfflineMysqlInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineMysqlInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineMysqlInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OfflineMysqlInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *升级mysql实例
     * @param req UpgradeMysqlInstanceRequest
     * @return UpgradeMysqlInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeMysqlInstanceResponse UpgradeMysqlInstance(UpgradeMysqlInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeMysqlInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeMysqlInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeMysqlInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
