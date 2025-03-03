Each plan can have a compact or detailed response.<br/>
It depends on the parameter ``compact``.<br/>
* The fields are
    * planId
    * noticeBoards
        * path
        * numOfNotices
        * numOfExpectingOrders
        * numOfAnnouncements
        * numOfPostedNotices
        * numOfExpectedNotices
        * notices (compact==false)
            * id
            * state (POSTED, EXPECTED, ANNOUNCED)
            * expectingOrders
    * closed
