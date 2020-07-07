/**********************************************************************************************************************************************************************************
 * Copyright (c) 2020. All rights reserved by Darshan and all his affiliates.                                                                                                     *
 * The program "Util.kt" is a part of the project "Zombie Network Servicer" and is distributed along with the same.                                                               *
 * This code is provided to you under the terms of the accompanying license.                                                                                                      *
 * You may use, distribute or modify the code under these terms by accompanying the original source copy and the copy of the license file.                                        *
 * You should have the license file accompanying the original source code.                                                                                                        *
 *                                                                                                                                                                                *
 * IN NO EVENT SHALL REGENTS BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES,                                                          *
 * INCLUDING LOST PROFITS, ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF REGENTS HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.                     *
 * REGENTS SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.                  *
 * THE SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY, PROVIDED HEREUNDER IS PROVIDED "AS IS".                                                                                   *
 * REGENTS HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.                                                                            *
 *                                                                                                                                                                                *
 * Code by Darshan.                                                                                                                                                               *
 *                                                                                                                                                                                *
 * Last Modified - 07/07/20 16:13                                                                                                                                                 *
 **********************************************************************************************************************************************************************************/

package techd.cybertech.networktempt

import java.security.SecureRandom

/**
 * @author Darshan
 *
 */
// TODO Add JavaDocs

class Util {

    /**
     *  Function to Obtain Requests
     */
    fun getRequests(url:String,hostname:String,query:String): String {
        val header: List<String> = Builder.headers(url,hostname,query)
        val request: StringBuilder = StringBuilder()
        // Add headers as a request component
        for (head in header) {
            request.append(head)
            request.append("\r\n")
        }
        // Final CRLF string appended
        request.append("\r\n")
        // returns the final string
        return request.toString()
    }

/*----------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     *  Data Builder Class
     */
    class Builder{
        companion object{ // For easy access
            // Just some variables
            var host:String=""
            var queryRef:String="refer_request"

            /**
             * Private function to create header list
             */
            fun headers(url: String,hostname:String,queryStr: String): List<String> {
                host=hostname
                queryRef=queryStr
                val header: MutableList<String> = ArrayList()

                // Completely random parameters
                val mQuery = getQuery()
                val mLink = String.format("%s?%s",url,mQuery)
                val mUserAgent = getUserAgents()
                val mEncoding = genEncoding()

                // To make it even more unique, other parameters will be randomly added
                if (Modifier.randBool()){
                    header.add(String.format("Content-Type: %s", Modifier.blockBuilder(5)))
                }
                if (Modifier.randBool()){
                    header.add(String.format("Accept-Charset: %s", genCharset()))
                }
                if (Modifier.randBool()){
                    header.add(String.format("Referer: %s", getReferrer()))
                }
                if (Modifier.randBool()){
                    header.add(String.format("Cookie: %s", Modifier.blockBuilder(Modifier.randInt(1,9))))
                }

                // Now, combine the parameters

                header.add(String.format("Host: %s", host))
                header.add("Cache-Control: no-cache")
                header.add(String.format("User-Agent: %s", mUserAgent))
                header.add(String.format("Accept-Encoding: %s", mEncoding))
                header.add(String.format("Keep-Alive: %d", Modifier.randInt(110, 120)))

                // Time to randomise it all !!!!
                header.shuffle()

                // Adding final parameters
                header.add(0, String.format("HEAD %s HTTP/1.1",mLink)) // add to top
                header.add("Connection: Keep-Alive") // add to bottom
                // Final List
                return header.toList()
            }

            /**
             * Function to generate random charsets
             */
            fun genCharset(): String {
                val charsets:MutableList<String> = ArrayList()
                charsets.add("ISO-8859-1")
                charsets.add("utf-8")
                charsets.add("Windows-1251")
                charsets.add("ISO-8859-2")
                charsets.add("ISO-8859-15")

                charsets.shuffle() // Shuffle to get Random charsets

                return String.format("%s,%s;q=%.2f,*;=%.2f", charsets.get(0), charsets.get(1), Modifier.randFloat(0.1f, 1.0f), Modifier.randFloat(0.1f, 1.0f))
            }

            /**
             * Function to randomly generate acceptable file encoding formats
             */
            fun genEncoding():String{
                val encoding:MutableList<String> = ArrayList()
                encoding.add("ISO-8859-1")
                encoding.add("utf-8")
                encoding.add("Windows-1251")
                encoding.add("ISO-8859-2")
                encoding.add("ISO-8859-15")

                encoding.shuffle() // Shuffle to get Random encodings

                return String.format("%s,%s", encoding.get(0), encoding.get(1))
            }

            /**
             * Function to generate random user-agents
             */
            fun getUserAgents():String{
                val userAgents: MutableList<String> = ArrayList()
                userAgents.add("Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.1.3) Gecko/20090913 Firefox/3.5.3")
                userAgents.add("Mozilla/5.0 (Windows; U; Windows NT 6.1; en; rv:1.9.1.3) Gecko/20090824 Firefox/3.5.3 (.NET CLR 3.5.30729")
                userAgents.add("Mozilla/5.0 (Windows; U; Windows NT 5.2; en-US; rv:1.9.1.3) Gecko/20090824 Firefox/3.5.3 (.NET CLR 3.5.30729")
                userAgents.add("Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.1.1) Gecko/20090718 Firefox/3.5.1")
                userAgents.add("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/532.1 (KHTML, like Gecko) Chrome/4.0.219.6 Safari/532.1")
                userAgents.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; InfoPath.2)")
                userAgents.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/4.0; SLCC1; .NET CLR 2.0.50727; .NET CLR 1.1.4322; .NET CLR 3.5.30729; .NET CLR 3.0.30729")
                userAgents.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2; Win64; x64; Trident/4.0")
                userAgents.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; SV1; .NET CLR 2.0.50727; InfoPath.2")
                userAgents.add("Mozilla/5.0 (Windows; U; MSIE 7.0; Windows NT 6.0; en-US")
                userAgents.add("Mozilla/4.0 (compatible; MSIE 6.1; Windows XP")
                userAgents.add("Opera/9.80 (Windows NT 5.2; U; ru) Presto/2.5.22 Version/10.51")

                userAgents.shuffle() // Shuffle to get random agent

                return userAgents[0]
            }

            /**
             * Function to generate random referral urls
             */
            fun getReferrer():String{
                val referers: MutableList<String> = ArrayList()
                val fakeQuery: String = Modifier.blockBuilder(Modifier.randInt(3, 8))

                referers.add(String.format("http://www.google.com/?q=%s", fakeQuery))
                referers.add(String.format("http://www.bing.com/search?q=%s",fakeQuery))
                referers.add(String.format("http://search.yahoo.com/search?q=%s",fakeQuery))
                referers.add(String.format("http://%s/", host))

                referers.shuffle()

                return referers[0] // first item

            }

            /**
             * Function to generate random queries
             */
            fun getQuery():String{
                val queryString = StringBuilder()
                queryString.append(queryRef)
                queryString.append('&')

                val nTuples: Int = Modifier.randInt(1, 6)

                for (i in 0 until nTuples) {
                    val tupleKey: String = Modifier.blockBuilder(Modifier.randInt(3, 8))
                    val tupleValue: String = Modifier.blockBuilder(Modifier.randInt(3, 20))
                    queryString.append(String.format("%s=%s", tupleKey, tupleValue))
                    if (i < nTuples - 1) queryString.append('&')
                }

                return queryString.toString()
            }

        }// End of the Builder Class
    }

/*----------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     *  A class to handle data processing
     */
    class Modifier{
        // Just to use functions directly.
        companion object{

        /**
         *  Initializing the Secure Random function - SecureRandom is just for fun :)
         */
        private var r = SecureRandom()

        /**
         *  List Appender Function
         *
         */
        fun appendList(lst:List<String>,glue:String):String{
            val itr = lst.iterator()
            val aLst = StringBuilder()
            while (itr.hasNext()){
                aLst.append(itr.next())
                if (itr.hasNext()){
                    aLst.append(glue)
                }
            }
            return aLst.toString()
        }

        /**
         * Generate Blocks of Data
         */
        fun blockBuilder(len: Int): String {
            val strBuild: StringBuilder = StringBuilder()
            val blockSet: String = "ABCDEFGHIJKLKMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0987654321"
            val blockLen: Int = blockSet.length
            for (x in 0 until len) {
                val ch = blockSet.get(r.nextInt(blockLen))
                strBuild.append(ch)
            }
            return strBuild.toString()
        }

        /**
         * Generate Random Float Values
         *
         */
        fun randFloat(start: Float, end: Float): Float {
            return r.nextFloat() * (end - start) + start
        }

        /**
         * Generate Random Float Values
         */
        fun randInt(start: Int, end: Int): Int {
            return r.nextInt((end - start) + 1) + start
        }

        /**
             * Generate Random Boolean Values
             */
        fun randBool(): Boolean {
            return r.nextInt(2) > 0
        }

        }// End of the Modifier Class
    }
/*----------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     *  Networking Class
     */
    class NetworkHandler{
    }
/*----------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     *  Data Class
     */
    class Datasheet{
        var _url:String=""
        var _host:String=""
        var _query:String=""
        fun Datasheet(url:String,host:String,query:String){
            this._host=host
            this._query=query
            this._url=url
        }

    }
/*----------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     *  Constants Class
     */
    class TXT{
        companion object{
            const val RESPONSE_OK:String = "Response was accepted"
            const val RESPONSE_CLOSED:String = "The session was closed"
            const val RESPONSE_ERROR:String = "Encountered some errors"
            const val RESPONSE_COMPLETE:String = "The task was completed"
            const val RESPONSE_UNKNOWN:String = "The outcome was unknown"
            const val RESPONSE_UNREACHABLE:String = "Target not reachable"
        }
    }
/*----------------------------------------------------------------------------------------------------------------------------------------------*/
// End of class
}

