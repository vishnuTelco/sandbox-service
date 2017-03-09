/*******************************************************************************
 * Copyright (c) 2015-2017, WSO2.Telco Inc. (http://www.wso2telco.com)
 *
 * All Rights Reserved. WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.services.dep.sandbox.servicefactory.smsmessaging.gateway;


import com.wso2telco.services.dep.sandbox.dao.model.custom.DeliveryInfoList;
import com.wso2telco.services.dep.sandbox.dao.model.custom.OutboundSMSMessageRequest;

class OutboundSMSMessageResponseBean {


    private OutboundSMSMessageResponse_Gw outboundSMSMessageRequest;


    public OutboundSMSMessageResponse_Gw getOutboundSMSMessageRequest() {
        return outboundSMSMessageRequest;
    }

    public void setOutboundSMSMessageRequest(OutboundSMSMessageResponse_Gw outboundSMSMessageRequest) {
        this.outboundSMSMessageRequest = outboundSMSMessageRequest;
    }

    public static class OutboundSMSMessageResponse_Gw extends OutboundSMSMessageRequest {


        private DeliveryInfoList deliveryInfoList;
        private String senderAddress;
        private String senderName;
        private String resourceURL;


        public DeliveryInfoList getDeliveryInfoList() {
            return deliveryInfoList;
        }

        public void setDeliveryInfoList(DeliveryInfoList deliveryInfoList) {
            this.deliveryInfoList = deliveryInfoList;
        }

        public String getSenderAddress() {
            return senderAddress;
        }

        public void setSenderAddress(String senderAddress) {
            this.senderAddress = senderAddress;
        }

        public String getSenderName() {
            return senderName;
        }

        public void setSenderName(String senderName) {
            this.senderName = senderName;
        }

        public String getResourceURL() {
            return resourceURL;
        }

        public void setResourceURL(String resourceURL) {
            this.resourceURL = resourceURL;
        }
    }


}