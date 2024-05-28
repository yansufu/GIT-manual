<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>appointment</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>8074c93a-aad0-43ba-ae5d-386fa4e354fa</testSuiteGuid>
   <testCaseLink>
      <guid>0201172c-87a2-4f79-ad2f-ed29f3aa485b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Appointment_Data_Driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b1d8be17-6dd3-4478-bcbb-47667dfb3c99</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Appointment excel</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>b1d8be17-6dd3-4478-bcbb-47667dfb3c99</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>facility</value>
         <variableId>10ce8a98-d8b7-4b70-8bf3-db24de8fcd4f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b1d8be17-6dd3-4478-bcbb-47667dfb3c99</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>healthcare_program</value>
         <variableId>117bbe36-6db3-44d0-95ea-5c82ec6cc9fe</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b1d8be17-6dd3-4478-bcbb-47667dfb3c99</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>hospital_readmission</value>
         <variableId>ec33ab52-37ea-4fca-bc23-41475351906e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b1d8be17-6dd3-4478-bcbb-47667dfb3c99</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>visit_date</value>
         <variableId>0ed64cd0-e3eb-481b-9fc8-5f49b12c49b3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b1d8be17-6dd3-4478-bcbb-47667dfb3c99</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>comment</value>
         <variableId>ee1f7700-9e99-4d82-8c9e-21009ae9d09c</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>fc64330e-6a45-4141-a711-27de90c34096</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/block_login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
