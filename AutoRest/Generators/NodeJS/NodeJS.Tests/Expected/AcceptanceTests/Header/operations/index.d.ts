/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
*/

import { ServiceClientOptions, RequestOptions, ServiceCallback } from 'ms-rest';
import * as moment from 'moment';
import * as models from '../models';


/**
 * @class
 * Header
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestSwaggerBATHeaderService.
 */
export interface Header {

    /**
     * Send a post request with header value "User-Agent": "overwrite"
     *
     * @param {string} userAgent Send a post request with header value
     * "User-Agent": "overwrite"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramExistingKey(userAgent: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramExistingKey(userAgent: string, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header value "User-Agent": "overwrite"
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseExistingKey(options: RequestOptions, callback: ServiceCallback<void>): void;
    responseExistingKey(callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header value "Content-Type": "text/html"
     *
     * @param {string} contentType Send a post request with header value
     * "Content-Type": "text/html"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramProtectedKey(contentType: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramProtectedKey(contentType: string, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header value "Content-Type": "text/html"
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseProtectedKey(options: RequestOptions, callback: ServiceCallback<void>): void;
    responseProtectedKey(callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "positive", "value": 1
     * or "scenario": "negative", "value": -2
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "positive" or "negative"
     * 
     * @param {number} value Send a post request with header values 1 or -2
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramInteger(scenario: string, value: number, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramInteger(scenario: string, value: number, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header value "value": 1 or -2
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "positive" or "negative"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseInteger(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseInteger(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "positive", "value": 105
     * or "scenario": "negative", "value": -2
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "positive" or "negative"
     * 
     * @param {number} value Send a post request with header values 105 or -2
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramLong(scenario: string, value: number, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramLong(scenario: string, value: number, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header value "value": 105 or -2
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "positive" or "negative"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseLong(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseLong(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "positive", "value":
     * 0.07 or "scenario": "negative", "value": -3.0
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "positive" or "negative"
     * 
     * @param {number} value Send a post request with header values 0.07 or -3.0
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramFloat(scenario: string, value: number, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramFloat(scenario: string, value: number, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header value "value": 0.07 or -3.0
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "positive" or "negative"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseFloat(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseFloat(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "positive", "value":
     * 7e120 or "scenario": "negative", "value": -3.0
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "positive" or "negative"
     * 
     * @param {number} value Send a post request with header values 7e120 or -3.0
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramDouble(scenario: string, value: number, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramDouble(scenario: string, value: number, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header value "value": 7e120 or -3.0
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "positive" or "negative"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseDouble(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseDouble(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "true", "value": true or
     * "scenario": "false", "value": false
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "true" or "false"
     * 
     * @param {boolean} value Send a post request with header values true or false
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramBool(scenario: string, value: boolean, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramBool(scenario: string, value: boolean, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header value "value": true or false
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "true" or "false"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseBool(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseBool(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "valid", "value": "The
     * quick brown fox jumps over the lazy dog" or "scenario": "null", "value":
     * null or "scenario": "empty", "value": ""
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid" or "null" or "empty"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {string} [options.value] Send a post request with header values "The
     * quick brown fox jumps over the lazy dog" or null or ""
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramString(scenario: string, value: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramString(scenario: string, value: string, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header values "The quick brown fox jumps over the lazy
     * dog" or null or ""
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid" or "null" or "empty"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseString(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseString(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "2010-01-01" or "scenario": "min", "value": "0001-01-01"
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid" or "min"
     * 
     * @param {date} value Send a post request with header values "2010-01-01" or
     * "0001-01-01"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramDate(scenario: string, value: Date|string, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramDate(scenario: string, value: Date|string, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header values "2010-01-01" or "0001-01-01"
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid" or "min"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseDate(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseDate(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "2010-01-01T12:34:56Z" or "scenario": "min", "value":
     * "0001-01-01T00:00:00Z"
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid" or "min"
     * 
     * @param {date} value Send a post request with header values
     * "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramDatetime(scenario: string, value: Date|string, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramDatetime(scenario: string, value: Date|string, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header values "2010-01-01T12:34:56Z" or
     * "0001-01-01T00:00:00Z"
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid" or "min"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseDatetime(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseDatetime(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "valid", "value": "Wed,
     * 01 Jan 2010 12:34:56 GMT" or "scenario": "min", "value": "Mon, 01 Jan 0001
     * 00:00:00 GMT"
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid" or "min"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {date} [options.value] Send a post request with header values "Wed,
     * 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT"
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramDatetimeRfc1123(scenario: string, value: Date, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramDatetimeRfc1123(scenario: string, value: Date, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon,
     * 01 Jan 0001 00:00:00 GMT"
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid" or "min"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseDatetimeRfc1123(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseDatetimeRfc1123(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "P123DT22H14M12.011S"
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid"
     * 
     * @param {moment.duration} value Send a post request with header values
     * "P123DT22H14M12.011S"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramDuration(scenario: string, value: moment.Duration, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramDuration(scenario: string, value: moment.Duration, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header values "P123DT22H14M12.011S"
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseDuration(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseDuration(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "啊齄丂狛狜隣郎隣兀﨩"
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid"
     * 
     * @param {buffer} value Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramByte(scenario: string, value: Buffer, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramByte(scenario: string, value: Buffer, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header values "啊齄丂狛狜隣郎隣兀﨩"
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseByte(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseByte(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send a post request with header values "scenario": "valid", "value": "GREY"
     * or "scenario": "null", "value": null
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid" or "null" or "empty"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {string} [options.value] Send a post request with header values
     * 'GREY' . Possible values for this parameter include: 'White', 'black',
     * 'GREY'
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    paramEnum(scenario: string, value: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    paramEnum(scenario: string, value: string, callback: ServiceCallback<void>): void;

    /**
     * Get a response with header values "GREY" or null
     *
     * @param {string} scenario Send a post request with header values "scenario":
     * "valid" or "null" or "empty"
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    responseEnum(scenario: string, options: RequestOptions, callback: ServiceCallback<void>): void;
    responseEnum(scenario: string, callback: ServiceCallback<void>): void;

    /**
     * Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the
     * header of the request
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    customRequestId(options: RequestOptions, callback: ServiceCallback<void>): void;
    customRequestId(callback: ServiceCallback<void>): void;
}
