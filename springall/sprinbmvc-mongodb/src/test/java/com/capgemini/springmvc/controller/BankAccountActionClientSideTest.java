/*
 * Copyright 2014 rugal.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.capgemini.springmvc.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;

import springmvc.ControllerClientSideTestBase;

public class BankAccountActionClientSideTest extends ControllerClientSideTestBase
{

    @Test
    @Ignore
    public void test() throws Exception
    {
        MvcResult result=this.mockMvc.perform(post("/getBalance")
        		.contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("accountId", "1")
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isOk())
        		.andExpect(content().string("1880.0"))
        		.andReturn();

        
        System.out.println("#############"+result.getResponse().getContentAsString());
    }
    
    @Test
    @Ignore
    public void inserttest() throws Exception {
    	MvcResult result=this.mockMvc.perform(post("/insertBankDetails")
        		.contentType(MediaType.APPLICATION_JSON)
                .content("{\r\n"
                		+ "    \"id\":8,\r\n"
                		+ "    \"accountHolderName\":\"BHANU Prakash\",\r\n"
                		+ "    \"accountType\":\"Type3\",\r\n"
                		+ "    \"accountBalance\":20000.0\r\n"
                		+ "}")
                .accept(MediaType.APPLICATION_JSON))
    			.andExpect(status().isOk()).andReturn();
    	 System.out.println("....."+result.getResponse().getContentAsString());
    }
    @Test
    @Ignore

    public void withdraw() throws Exception
    {
        MvcResult result=this.mockMvc.perform(post("/withdraw")
        		.contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("accountId", "2")
                .param("accountBalance","200.0")
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isOk())
        		.andExpect(content().string("1000.0"))
        		.andReturn();

        
        System.out.println("#############"+result.getResponse().getContentAsString());
    }
    @Test
    @Ignore
    public void deposit() throws Exception
    {
        MvcResult result=this.mockMvc.perform(post("/deposit")
        		.contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("accountId", "5")
                .param("accountBalance", "500.0")
                
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isOk())
        		.andExpect(content().string("1400.0"))
        		.andReturn();

        
        System.out.println("#############"+result.getResponse().getContentAsString());
    }
    @Test

    public void fundTransfer() throws Exception
    {
        MvcResult result=this.mockMvc.perform(post("/fundTransfer")
        		.contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("fromaccountId", "8")
                .param("toaccountId", "7")
                .param("amount", "5000")
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isOk())
        		.andReturn();

        
        System.out.println("#############"+result.getResponse().getContentAsString());
    }
 
    
}
