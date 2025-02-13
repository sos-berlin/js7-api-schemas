Each plan can have a compact or detailed response.<br/>
It depends on the parameter ``compact``.<br/>
* The fields are
    * planId
    * numOfOrders
    * orders (if exist and compact==false)
    * noticeBoards
        * path
        * numOfNotices
        * numOfExpectingOrders
        * notices
            * id
            * state (POSTED, EXPECTED, ANNOUNCED)
            * expectingOrders (if exist and compact==false)
    * closed
