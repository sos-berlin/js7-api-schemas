Each plan can have a compact or detailed response.<br/>
It depends on the parameter ``compact`` and ``includeOrders``.<br/>
* The fields are
    * planId
    * numOfOrders (includeOrders==true)
    * orders (includeOrders==true)
    * numOfNoticeBoards
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
